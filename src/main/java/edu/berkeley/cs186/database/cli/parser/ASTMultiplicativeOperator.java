/* Generated By:JJTree: Do not edit this line. ASTMultiplicativeOperator.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTMultiplicativeOperator extends SimpleNode {
  public ASTMultiplicativeOperator(int id) {
    super(id);
  }

  public ASTMultiplicativeOperator(RookieParser p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public void jjtAccept(RookieParserVisitor visitor, Object data) {
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a12912dc8da792670bb76b9eff13db92 (do not edit this line) */
