package com.interview.questions;

/**
 * SAP LABS - 30-April-2024
 *
 */
final class CustomImmutableClass {
    private int i;
    CustomImmutableClass(int i){
      this.i = i;
    }

    public CustomImmutableClass modify(int i){
        if(this.i == i){
            return this;
        } else{
            return new CustomImmutableClass(i);
        }
    }

}
