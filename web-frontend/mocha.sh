#!/bin/sh

mocha --watch --require babel-core/register src/test/javascript/setup.js src/test/javascript/*.spec.js
