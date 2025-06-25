## Tests for sleepIn()
| Test                  | Expected |
|-----------------------|----------|
| sleepIn(false, false) | true     |
| sleepIn(true, false)  | false    |
| sleepIn(false, true)  | true     |
| sleepIn(true, true)   | true     |

## Tests for countEvens()
| Test                          | Expected |
|-------------------------------|----------|
| countEvens( [2, 1, 2, 3, 4] ) | 3        |
| countEvens( [2, 2, 0] )       | 3        |
| countEvens( [1, 3, 5] )       | 0        |
| countEvens( [] )              | 0        |
| countEvens( [11, 9, 0, 1] )   | 1        |
| countEvens( [2, 11, 9, 0] )   | 2        |
| countEvens( [2] )             | 1        |
| countEvens( [2, 5, 12] )      | 2        |

## Tests for cigarParty()
| Test                  | Expected  |
|-----------------------|-----------|
| cigarParty(30, false) | 	false    |
| cigarParty(50, false) | 	true     |
| cigarParty(70, true)  | 	true     |
| cigarParty(30, true)  | 	false    |
| cigarParty(50, true)  | 	true     |
| cigarParty(60, false) | false  ** BUG **  |
| cigarParty(61, false) | 	false    |
| cigarParty(40, false) | false  ** BUG **  |
| cigarParty(39, false) | 	false    |
| cigarParty(40, true)  | 	true     |
| cigarParty(39, true)  | 	false    |

## Tests for repeatSeparator()
| Test                              | Expected         |
|-----------------------------------|------------------|
| repeatSeparator("Word", "X", 3)   | "WordXWordXWord" |
| repeatSeparator("This", "And", 2) | "ThisAndThis"    |
| repeatSeparator("This", "And", 1) | "This"           |
| repeatSeparator("Hi", "-n-", 2)   | "Hi-n-Hi"        |
| repeatSeparator("AAA", "", 1)     | "AAA"            |
| repeatSeparator("AAA", "", 0)     | "AAA"  ** BUG ** |
| repeatSeparator("XYZ", "a", 2)    | "XYZaXYZ"        |
| repeatSeparator("abc", "XX", 3)   | "abcXXabcXXabc"  |
| repeatSeparator("A", "B", 5) →    | "ABABABABA"      |
| repeatSeparator("abc", "XX", 2)   | "abcXXabc"       |
| repeatSeparator("abc", "XX", 1)   | "abc"            |

