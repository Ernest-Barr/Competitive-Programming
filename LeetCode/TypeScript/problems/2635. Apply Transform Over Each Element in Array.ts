function map(arr: number[], fn: (n: number, i: number) => number): number[] {
    const res: number[] = [];

    for (let j = 0; j < arr.length; ++j) {
        res[j] = fn(arr[j], j);
    }

    return res;
}