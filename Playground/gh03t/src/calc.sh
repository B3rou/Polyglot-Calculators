#!/bin/bash

# Parse Input and Args
expression="$*"

# Calculate Expression
result=$(echo "$expression" | bc -l)
result=$(awk '{printf "%g\n", $0}' <<< "$result") # remove trailing zeros (0)

# Return Result
echo "$result"