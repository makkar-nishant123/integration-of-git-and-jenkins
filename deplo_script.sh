git add . 
git commit -am "$1"
git push origin master 
curl -u admin:0859ca4446544e66973d52951757c9de  http://localhost:8080/job/maven_job_git_2/build?token=CI_test
