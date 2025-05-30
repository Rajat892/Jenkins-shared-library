def call(String image, String tag)
{
  echo "Building the code"
  sh "docker build -t ${image}:${tag} ."
}
