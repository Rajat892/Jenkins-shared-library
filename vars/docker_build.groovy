def call(String user, String image, String tag)
{
  echo "Building the code"
  sh "docker build -t ${user}/${image}:${tag} ."
}
