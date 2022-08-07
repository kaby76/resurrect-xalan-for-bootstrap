# Xalan resurrection

This repo is the Xalan code at 2.12.2, copied from the downloaded
tarball file. Note, the svn repo for Xalan is in complete disarray--it
does not compile. The code here builds with Maven "mvn clean package".

The purpose of this code is for [Piggy](https://github.com/kaby76/Domemtech.Trash/tree/main/trpiggy).
I plan to convert the engine to C# and then extend it for a different tree
rewrite language--I do not like XSLT's format. With that, I can then
write a realistic transpiler for Java to C# and integrate a real engine.
