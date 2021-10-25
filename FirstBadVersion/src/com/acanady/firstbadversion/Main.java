package com.acanady.firstbadversion;

public class Main {

    public static int bad = 1;
    public static int versions = 20;
    public static int badVersioncalls = 0;

    public static boolean isBadVersion(int version){
        if (version >= bad){
            badVersioncalls++;
            return true;
        }
        else{
            badVersioncalls++;
            return false;
        }

    }

    public static int versionControl(){

        int offset = 0;
        while(true){
            int check = (versions - offset)/2 + offset;
            if(check == 0){ //we're at 1
                return check + 1;
            }
            if(isBadVersion(check)){
                if(!isBadVersion(check-1))
                    return check;
                else
                    versions = check - 1;
            }
            else{
                offset = check + 1;
            }
        }
    }

    public static void main(String[] args){
        System.out.println(versionControl());
        System.out.println(badVersioncalls);
    }
}
