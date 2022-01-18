pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Hello Build'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Hello Test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Hello Deploy'
            }
        }
        
    }
    
    post
        {
            always
            {
                emailext body: 'Description', subject: 'Jenkins subject', to: 'tanusree.das.wgs@gmail.com'
            }
        }
}
