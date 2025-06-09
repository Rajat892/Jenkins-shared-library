def call(){
  cd /home/ubuntu/workspace/Wanderlust-CI/frontend && sudo npm install && cd ../backend && sudo npm install && cd .. && sudo npm install
  dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
