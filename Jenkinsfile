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
        stage('Docker Build To Image')
        {
            steps
            {
               sh 'docker build -t revanth321/spe .'
            }
        }
        stage('Push Docker Image')
        { 
                withDockerRegistry([ credentialsId: "Dockerhubaccount", url: "" ]) {
        bat "docker push revanth321/spe:latest"
        }
            
                
            
        }
    }
}