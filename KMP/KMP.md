# COMPUTE- PREFIX- FUNCTION (P)
 1. m ←length [P]		//'p' pattern to be matched
 2. Π [1] ← 0
 3. k ← 0
 4. for q ← 2 to m
 5. do while k > 0 and P [k + 1] ≠ P [q]
 6. do k ← Π [k]
 7. If P [k + 1] = P [q]
 8. then k← k + 1
 9. Π [q] ← k
 10. Return Π


# KMP-MATCHER (T, P)
 1. n ← length [T]
 2. m ← length [P]
 3. Π← COMPUTE-PREFIX-FUNCTION (P)
 4. q ← 0		// numbers of characters matched
 5. for i ← 1 to n	// scan S from left to right 
 6. do while q > 0 and P [q + 1] ≠ T [i]
 7. do q ← Π [q]		// next character does not match
 8. If P [q + 1] = T [i]
 9. then q ← q + 1		// next character matches
 10. If q = m			           // is all of p matched?
 11. then print "Pattern occurs with shift" i - m
 12. q ← Π [q]				// look for the next match
