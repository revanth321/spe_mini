pipeline
{
    environment
    {
        imageName=""
    }
    agent any
    
    stages
    {
        stage("Git Build")
        {
            steps
            {
                git url: 'https://github.com/revanth321/spe_mini.git', branch: 'master'
            }
        }
        stage('Maven Builld')
        {
            steps
            {
                script
                {
                    sh 'mvn clean package'
                }
            }
        }
         stage('Docker Build To Image') {
            steps {
              script{
                  imageName =docker.build 'revanth321/spe'
              }
            }

         }
         stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry('','Dockerhubaccount'){
                    imageName.push()
                    }
                }
            }

         }
           stage('Ansible Pull Docker Image') {
            steps {
              ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'ansible', inventory: '/etc/ansible/hosts', playbook: 'playbook.yml', sudoUser: null
            }

        }
    }
}