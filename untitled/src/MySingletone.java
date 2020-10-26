public class MySingletone {
    private MySingletone instance;
    private String name;
    private MySingletone(){
        this.name = "MySingletone";
    }

    public MySingletone getInstance(){
        if(instance == null){
            instance = new MySingletone();
        }
         return instance;
        }


    }

