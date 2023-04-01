# RABIN-KARP-MATCHER (T, P, d, q)
 1. n ← length [T]
 2. m  ← length [P]
 3. h  ←  dm-1 mod q
 4. p ←  0
 5. t0 ←  0
 6. for i ← 1 to m
 7. do p ←  (dp + P[i]) mod q
 8. t0 ← (dt0+T [i]) mod q
 9. for s  ←  0 to n-m
 10. do if p = ts
 11. then if P [1.....m] = T [s+1.....s + m]
 12. then "Pattern occurs with shift" s
 13. If s < n-m
 14. then ts+1 ←  (d (ts-T [s+1]h)+T [s+m+1])mod q
