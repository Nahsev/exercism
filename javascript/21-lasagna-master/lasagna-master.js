/// <reference path="./global.d.ts" />

//import { forEach } from "core-js/core/array"

// @ts-check

/**
 * Implement the functions needed to solve the exercise here.
 * Do not forget to export them so they are available for the
 * tests. Here an example of the syntax as reminder:
 *
 * export function yourFunction(...) {
 *   ...
 * }
 */
export const cookingStatus = remindingTime => {
if(remindingTime===0){
    return 'Lasagna is done.'
}else if(remindingTime>0){
    return 'Not done, please wait.'
}else {
    return 'You forgot to set the timer.'
}
}


export function preparationTime(arr, average=2){
    return arr.length*average
}


export function quantities(arr){
    const amounts = {
        noodles:0,
        sauce:0
    }
    arr.forEach(element => {
        if(element=='noodles'){
            amounts.noodles+=50
        }else if(element=='sauce'){
            amounts.sauce+=0.2
        }
    });
    return amounts
}



export const addSecretIngredient = (arr1,arr2) => {arr2.push(arr1[arr1.length-1])}




export const scaleRecipe = (recipe,people) => {
    let amounts = {}
    for (const key in recipe) {
        amounts[key] = recipe[key]*people/2
    }
    return amounts
}