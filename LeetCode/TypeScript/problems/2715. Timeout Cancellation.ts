
type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type Fn = (...args: JSONValue[]) => void

function cancellable(fn: Fn, args: JSONValue[], t: number): Function {
    let cancel = false;

    setTimeout(() => {
        if(!cancel) fn(args);
    }, t);

    return () => {
        cancel = true;
    };
};