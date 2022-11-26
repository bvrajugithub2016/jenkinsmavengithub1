pipeline 
{
    agent any

    stages 
    {
        stage('MyBuild') 
        {
            steps 
            {
                echo 'Building the Application'
            }
        }
        stage('MyTest') 
        {
            steps 
            {
                echo 'Testing the Application'
            }
        }
        stage('MyDeploy') 
        {
            steps 
            {
                echo 'Deploy the Application'
            }
        }
    }
    post
    {
    	always
    	{
    		emailext body: 'Something went wrong in the Pipeline', subject : 'Pipeline Build Status', to: 'bvraju.itp@gmail.com'
    	}
    }
}
