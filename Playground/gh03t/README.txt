--- GH03T's Simple Calc ---

/- What is GH03T's Simple Calc

GH03T's Simple Calc is a minimal, barebones calculator 
written entirely in Bash, which wraps `bc` in a user-friendly
CLI interface.

/- How to Use The Calculator

To use GH03T's Simple Calc, simply navigate to the `src`
directory, and run the following Bash command, replacing <expression>
with your expression of choice -

    ./calc.sh "<expression>"

Note: The expression must be enclosed in quotation marks
to prevent bash from interpreting special characters.

/- Features Included

GH03T's Simple Calc supports all of the same features
that `bc` supports, however some are more refined.

For example, this calculator supports...

1. The automatic removal of trailing zeros,
2. PEMDAS / order of operations, and
3. A (virtually) infinite expression length.