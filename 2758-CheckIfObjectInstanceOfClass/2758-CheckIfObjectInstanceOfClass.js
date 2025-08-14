// Last updated: 8/14/2025, 11:17:42 AM
/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
    while(obj!=null){
        if(obj.constructor===classFunction){
            return true;
        }
        obj=Object.getPrototypeOf(obj);
    }
    return false;
};

/**
 * checkIfInstanceOf(new Date(), Date); // true
 */