

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        var one= 0;
        var two= 0;
        var three=0;
        var four=0;
        var five=0;
        var six=0;
        var seven=0;
        var eight=0;
        var nine=0;
        var zero=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==1){
                one++;
                if(one==2){
                    return true;
                }
            }
            if(nums[i]==2){
                two++;
                if(two==2){
                    return true;
                }
            }
            if(nums[i]==3){
                three++;
                if(three==2){
                    return true;
                }
            }
            if(nums[i]==4){
                four++;
                if(four==2){
                    return true;
                }
            }
            if(nums[i]==5){
                five++;
                if(five==2){
                    return true;
                }
            }
            if(nums[i]==6){
                six++;
                if(six==2){
                    return true;
                }
            }
            if(nums[i]==7){
                seven++;
                if(seven==2){
                    return true;
                }
            }
            if(nums[i]==8){
                eight++;
                if(eight==2){
                    return true;
                }
            }
            if(nums[i]==9){
                nine++;
                if(nine==2){
                    return true;
                }
            }
            if(nums[i]==0){
                zero++;
                if(zero==2){
                    return true;
                }
            }
        }
        return false;
    }
}
