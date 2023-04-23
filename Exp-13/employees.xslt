<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:template match="/">
    <html>
      <head>
        <title>Employee Information</title>
      </head>
      <body>
        <h1>Employee Information</h1>
        <table>
          <tr>
            <th>Name</th>
            <th>Status</th>
          </tr>
          <xsl:apply-templates select="//employee"/>
        </table>
      </body>
    </html>
  </xsl:template>

  <xsl:template match="employee">
    <tr>
      <td><xsl:value-of select="name"/></td>
      <td>
        <xsl:choose>
          <xsl:when test="status='part-time'">
            <span style="background-color: yellow;"><xsl:value-of select="status"/></span>
          </xsl:when>
          <xsl:otherwise>
            <xsl:value-of select="status"/>
          </xsl:otherwise>
        </xsl:choose>
      </td>
    </tr>
  </xsl:template>

</xsl:stylesheet>
