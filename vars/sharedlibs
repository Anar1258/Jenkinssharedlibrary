def call(String stagename)
{
   if ("${stagename}" == "Build")
     {
       sh "mvn clean package"
     }
  else if ("${stagename}" == "docker_login")
     {
       sh "docker login -u anjalisreedhar -p ${dockerhub_pwd}"
     }
 }
