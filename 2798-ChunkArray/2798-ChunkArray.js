// Last updated: 8/14/2025, 11:17:41 AM
/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let result = [];
    let i = 0;
    while (i < arr.length) {
        let temp = [];
        for (let j = 0; j < size && i < arr.length; j++) {
            temp.push(arr[i]);
            i++;
        }
        result.push(temp);
    }
    return result;
};

