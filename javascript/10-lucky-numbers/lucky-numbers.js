// @ts-check

/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {
  let element1 = array1.join('')
  let element2 = array2.join('')
  return Number(element1)+Number(element2)
}

/**
 * Checks whether a number is a palindrome.
 *
 * @param {number} value
 * @returns {boolean} whether the number is a palindrome or not
 */
export function luckyNumber(value) {
    let a = value.toString()
return a == a.split('').reverse().join('')
}
 
/**
 * Determines the error message that should be shown to the user
 * for the given input value.
 *
 * @param {string|null|undefined} input
 * @returns {string} error message
 */
export function errorMessage(input) {
  if(!input){
    return 'Required field'
  }if(isNaN(input) || input==0){
    return 'Must be a number besides 0'
  }else{
    return ''
  }
  
  
}
