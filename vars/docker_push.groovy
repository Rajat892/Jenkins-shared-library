def call(String username, String userpassword, String image, String tag){
  withCredentials(
    [
      usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')
    ]
  )
  {
     sh "docker login -u ${username} -p ${userpassword}"
  }
  sh "docker push ${username}/${image}:${tag}"
  echo "Image pushed to DockerHub"
}
