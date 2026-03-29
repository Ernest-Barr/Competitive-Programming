type Counter = {
    increment: () => number,
    decrement: () => number,
    reset: () => number,
}

function createCounter(init: number): Counter {
    let num = init;
    return {
        increment() {
            return ++num;
        },
        decrement() {
            return --num;
        },
        reset() {
            num = init;
            return num;
        }
    }
};