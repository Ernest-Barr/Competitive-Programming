type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type OnceFn = (...args: JSONValue[]) => JSONValue | undefined

function once(fn: Function): OnceFn {
    let called = false;

    return function (...args) {
         return !called ? (called = true, fn(...args)) : undefined;
    };
}