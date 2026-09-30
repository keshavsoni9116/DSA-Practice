class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // int boats = 0;
        // for(int i = 0; i < people.length; i++){
        //     if(people[i] == limit){
        //         boats++;
        //         continue;
        //     } else if(people[i] == 0){
        //         continue;
        //     }

        //     boolean match = false;
        //     int remaining = limit - people[i];
        //     for(int j = i+1; j < people.length; j++){
        //         if(people[j] != 0 && people[j] <= remaining){
        //             boats++;
        //             people[j] = 0;
        //             match = true;
        //             break;
        //         }
        //     }
        //     if(!match){
        //         boats++;
        //     }
        // }
        // return boats;

        Arrays.sort(people);
        int left = 0;
        int boats = 0;
        int right = people.length - 1;
        while(left <= right){
            if(people[left] + people[right] > limit){
                right--;
                boats++;
                continue;
            }

            left++;
            right--;
            boats++;

        
        }
        return boats;
    }
}