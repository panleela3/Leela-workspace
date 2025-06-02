package com.java;

public class DBConnection {
        private static volatile DBConnection instance;
        private DBConnection(){}
    //1.single threaded environment (not thread safe)
    //2.to make thread safe use double check lock by synchronized block
        public static  DBConnection getInstance(){
            //single check
            if (instance==null){
                //double check
                //3. memory and cache doesn't syn which leads duplication of object(two objects) ,
                // to resolve this issue we can declare the instance as volatile
                // which read val from main memory instead of cache
                synchronized (DBConnection.class){
                    if (instance==null){
                        instance=new DBConnection();
                    }
                }

            }
            return instance;
        }
}
