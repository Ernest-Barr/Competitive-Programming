type Fn = (...params: number[]) => number

function memoize(fn: Fn): Fn {
    // @ts-ignore
    const map: Map<string, number> = new Map<string, number>();

    return function(...args) {
        const key = JSON.stringify(args)

        if (map.has(key)) {
            return map.get(key)
        } else {
            const res = fn(...args);
            map.set(key, res)
            return res;
        }
    }
}