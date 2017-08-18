## Steps

1. Install lumo and calvin
2. `calvin repl`
3. In the repl `(require 'clara.rules)`
4. Get the following error

```
$ calvin repl
Lumo 1.6.0
ClojureScript 1.9.671
Node.js v8.1.3
 Docs: (doc function-name-here)
       (find-doc "part-of-name-here")
 Source: (source function-name-here)
 Exit: Control+D or :cljs/quit or exit

cljs.user=> (require 'clara.rules)
            ⬆
WARNING: macroexpand already refers to: cljs.core/macroexpand being replaced by: clojure.reflect/macroexpand at line 33 clojure/reflect.cljs
                     ⬆
WARNING: Use of undeclared Var schema.utils$macros/class at line 25 schema/utils.clj
                     ⬆
WARNING: Use of undeclared Var schema.utils$macros/class at line 32 schema/utils.clj
                           ⬆
WARNING: Use of undeclared Var schema.utils$macros/format at line 36 schema/utils.clj
              ⬆
WARNING: No such namespace: clojure.lang.Compiler, could not locate clojure/lang/Compiler.cljs, clojure/lang/Compiler.cljc, or Closure namespace "" at line 49 schema/utils.clj
              ⬆
WARNING: Use of undeclared Var clojure.lang.Compiler/CHAR_MAP at line 49 schema/utils.clj
                                       ⬆
WARNING: Use of undeclared Var schema.utils$macros/class at line 64 schema/utils.clj
            ⬆
WARNING: Use of undeclared Var schema.utils$macros/print-method at line 95 schema/utils.clj
               ⬆
WARNING: Use of undeclared Var schema.utils$macros/print-method at line 96 schema/utils.clj
            ⬆
WARNING: Use of undeclared Var schema.utils$macros/print-method at line 116 schema/utils.clj
               ⬆
WARNING: Use of undeclared Var schema.utils$macros/print-method at line 117 schema/utils.clj
                                                   ⬆
WARNING: No such namespace: java.util.Collections, could not locate java/util/Collections.cljs, java/util/Collections.cljc, or Closure namespace "" at line 141 schema/utils.clj
                                                   ⬆
WARNING: Use of undeclared Var java.util.Collections/synchronizedMap at line 141 schema/utils.clj
                         ⬆
WARNING: Use of undeclared Var schema.utils$macros/class? at line 147 schema/utils.clj
                                                                                 ⬆
WARNING: Use of undeclared Var schema.utils$macros/class at line 148 schema/utils.clj
ERROR in file schema/utils.clj
     (new)
     Function.cljs.core.ex_info.cljs$core$IFn$_invoke$arity$3 (NO_SOURCE_FILE <embedded>:1935:200)
     Function.cljs.analyzer.error.cljs$core$IFn$_invoke$arity$3 (NO_SOURCE_FILE <embedded>:2482:92)
     (NO_SOURCE_FILE <embedded>:5947:100)
     z (NO_SOURCE_FILE <embedded>:5948:13)
     (NO_SOURCE_FILE <embedded>:5942:232)
     (NO_SOURCE_FILE <embedded>:5862:482)
     Object.cljs.js.load_macros (NO_SOURCE_FILE <embedded>:5838:464)
     (NO_SOURCE_FILE <embedded>:5857:20)
     Object.cljs.js.load_macros (NO_SOURCE_FILE <embedded>:5838:464)

No protocol method IMultiFn.-add-method defined for type undefined:
     Object.cljs.core.missing_protocol (NO_SOURCE_FILE <embedded>:179:229)
     cljs.core._add_method (NO_SOURCE_FILE <embedded>:1841:468)
     (evalmachine.<anonymous>:272:23)
     ContextifyScript.Script.runInThisContext (vm.cljs:44:33)
     Object.runInThisContext (vm.cljs:116:38)
     (Object.lumoEval)
     lumo.repl.caching_node_eval (NO_SOURCE_FILE <embedded>:6211:68)
     (NO_SOURCE_FILE <embedded>:5947:29)
     z (NO_SOURCE_FILE <embedded>:5948:13)
     (NO_SOURCE_FILE <embedded>:5942:232)


```