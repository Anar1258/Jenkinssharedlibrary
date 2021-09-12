def call(String stagename)
{
   if ("${stagename}" == "Build")
     {
       sh "mvn clean package"
     }
  else if ("${stagename}" == "docker_login")
     {
        withCredentials([string(credentialsId: 'Docker_Hub_Pwd', variable: 'dockerhub_pwd')]) {
       sh "docker login -u anjalisreedhar -p ${dockerhub_pwd}"
     
        }
     }
 }
