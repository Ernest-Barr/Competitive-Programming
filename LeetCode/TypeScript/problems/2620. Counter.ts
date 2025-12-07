const createCounter = function(n: number) {
    let count = 0;
    return function() {
        return n + count++
    };
};