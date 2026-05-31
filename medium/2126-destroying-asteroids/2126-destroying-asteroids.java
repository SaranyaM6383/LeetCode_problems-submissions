        long currentMass=mass;
        for(int asteroid:asteroids){
            if(currentMass < asteroid){
                return false;
            }
        }
            currentMass += asteroid;
        return true;
    }
}