package com.acanady.challengesolutions;

//Example of main function calling FirstBadVersion
/*public static void main(String[] args){

        FirstBadVersion fbv = new FirstBadVersion(105,20000);
        System.out.println(fbv.versionControl());

    }
*/

public class FirstBadVersion {

    private int bad = 1;
    private int versions = 20;

    FirstBadVersion(int bad, int versions){
        this.bad = bad;
        this.versions = versions;
    }

    public boolean isBadVersion(int version){
        if (version >= bad){
            return true;
        }
        else{
            return false;
        }

    }
    public int versionControl(){

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

}
