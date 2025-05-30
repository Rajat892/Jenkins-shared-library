def call(String username, String image, String tag){
  withCredentials(
    [
      usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')
    ]
  )
  {
     sh "docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD}"
  }
  sh "docker push ${DOCKER_USERNAME}/${image}:${tag}"
  echo "Image pushed to DockerHub"
}
