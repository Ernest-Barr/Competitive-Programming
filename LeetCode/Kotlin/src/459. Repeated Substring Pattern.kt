fun repeatedSubstringPattern(s: String): Boolean = s in (s + s).substring(1, s.length * 2 - 1)
