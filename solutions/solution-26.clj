(defn solution-26
  ;; Solution for 4Clojure 26th problem - first N Fibonacci numbers
  ;; http://www.4clojure.com/problem/26
  [n] (take n (map (fn fib [x]
                     (case x
                       0 0
                       1 1
                       (+ (fib (dec x)) (fib (- x 2)))))
                   (iterate inc 1))))
