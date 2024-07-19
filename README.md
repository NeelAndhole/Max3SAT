# Max3SAT
This contains a randomized algorithm for the MAX3SAT problem.
The input will start with a positive integer n giving the number of variables, then a positive integer m
giving the number of clauses, and then m lines describing each clause. The description of the clause
will have three integers x y z, where |x| encodes the variable number appearing in the first literal in
the clause, the sign of x will be negative if and only if the literal is negated, and likewise for y and z
to describe the two remaining literals in the clause. For example, 3 − 1 − 4 corresponds to the clause
x3 ∨ x1 ∨ x4.

Note that this algorithm gaurantees 7/8 clauses satisfied
