type ToBeOrNotToBe = {
    toBe: (val: any) => boolean;
    notToBe: (val: any) => boolean;
};

function expect(val: any): ToBeOrNotToBe {
    return {
        toBe: (other: any) => {
            if (other !== val) throw new Error("Not Equal");
            return true;
        },

        notToBe: (other: any) => {
            if (val === other) throw new Error("Equal");
            return true;
        }
    };
};