# factories

A Clojure library for producing *simple* factory data.

## Usage

Super simple:

``` clojure
(use 'factories.core)

(defactory user {:first-name "Johnny"
                 :last-name "Depp"
                 :email "johnny@gmail.com"})

(user {:email "depp@gmail.com"})

=> {:first-name "Johnny" :last-name "Depp" :email "depp@gmail.com"}
```

Note that `defactory` defines a set of defaults for a function called `user`. The first argument to `user` is a map which will *override* the defaults.

Have a nice day.

## License

Copyright © 2013 Banzai Inc.

Distributed under the Eclipse Public License, the same as Clojure.
