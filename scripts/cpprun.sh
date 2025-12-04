#!/bin/sh

if [ -z "$1" ]; then
    echo "Usage: $0 <filename.cpp>"
    exit 1
fi

src="$1"

shift

if [ ! -f "$src" ]; then
    echo "File not found"
    exit 1
fi

fname=$(basename "$src" .cpp)
oname="${fname}.out"

g++ "$src" -o "$oname"

if [ $? -eq 0 ]; then
    echo "Compiled"
    echo "-----"

    ./"$oname" "$@"

    rm "$oname"

else
    echo "Compilation failed"
    exit 1
fi
