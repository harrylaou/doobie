// Copyright (c) 2013-2018 Rob Norris and Contributors
// This software is licensed under the MIT License (MIT).
// For more information see LICENSE or https://opensource.org/licenses/MIT

package doobie.tagless.jdbc

import java.lang.Class
import java.lang.String
import java.sql.Connection
import java.sql.DatabaseMetaData
import java.sql.ResultSet
import java.sql.RowIdLifetime

/** Algebra of operations for `java.sql.DatabaseMetaData`. */
@SuppressWarnings(Array("org.wartremover.warts.Overloading"))
trait JdbcDatabaseMetaData[F[_]] {
  def allProceduresAreCallable: F[Boolean]
  def allTablesAreSelectable: F[Boolean]
  def autoCommitFailureClosesAllResultSets: F[Boolean]
  def dataDefinitionCausesTransactionCommit: F[Boolean]
  def dataDefinitionIgnoredInTransactions: F[Boolean]
  def deletesAreDetected(a: Int): F[Boolean]
  def doesMaxRowSizeIncludeBlobs: F[Boolean]
  def generatedKeyAlwaysReturned: F[Boolean]
  def getAttributes(a: String, b: String, c: String, d: String): F[ResultSet]
  def getBestRowIdentifier(a: String, b: String, c: String, d: Int, e: Boolean): F[ResultSet]
  def getCatalogSeparator: F[String]
  def getCatalogTerm: F[String]
  def getCatalogs: F[ResultSet]
  def getClientInfoProperties: F[ResultSet]
  def getColumnPrivileges(a: String, b: String, c: String, d: String): F[ResultSet]
  def getColumns(a: String, b: String, c: String, d: String): F[ResultSet]
  def getConnection: F[Connection]
  def getCrossReference(a: String, b: String, c: String, d: String, e: String, f: String): F[ResultSet]
  def getDatabaseMajorVersion: F[Int]
  def getDatabaseMinorVersion: F[Int]
  def getDatabaseProductName: F[String]
  def getDatabaseProductVersion: F[String]
  def getDefaultTransactionIsolation: F[Int]
  def getDriverMajorVersion: F[Int]
  def getDriverMinorVersion: F[Int]
  def getDriverName: F[String]
  def getDriverVersion: F[String]
  def getExportedKeys(a: String, b: String, c: String): F[ResultSet]
  def getExtraNameCharacters: F[String]
  def getFunctionColumns(a: String, b: String, c: String, d: String): F[ResultSet]
  def getFunctions(a: String, b: String, c: String): F[ResultSet]
  def getIdentifierQuoteString: F[String]
  def getImportedKeys(a: String, b: String, c: String): F[ResultSet]
  def getIndexInfo(a: String, b: String, c: String, d: Boolean, e: Boolean): F[ResultSet]
  def getJDBCMajorVersion: F[Int]
  def getJDBCMinorVersion: F[Int]
  def getMaxBinaryLiteralLength: F[Int]
  def getMaxCatalogNameLength: F[Int]
  def getMaxCharLiteralLength: F[Int]
  def getMaxColumnNameLength: F[Int]
  def getMaxColumnsInGroupBy: F[Int]
  def getMaxColumnsInIndex: F[Int]
  def getMaxColumnsInOrderBy: F[Int]
  def getMaxColumnsInSelect: F[Int]
  def getMaxColumnsInTable: F[Int]
  def getMaxConnections: F[Int]
  def getMaxCursorNameLength: F[Int]
  def getMaxIndexLength: F[Int]
  def getMaxLogicalLobSize: F[Long]
  def getMaxProcedureNameLength: F[Int]
  def getMaxRowSize: F[Int]
  def getMaxSchemaNameLength: F[Int]
  def getMaxStatementLength: F[Int]
  def getMaxStatements: F[Int]
  def getMaxTableNameLength: F[Int]
  def getMaxTablesInSelect: F[Int]
  def getMaxUserNameLength: F[Int]
  def getNumericFunctions: F[String]
  def getPrimaryKeys(a: String, b: String, c: String): F[ResultSet]
  def getProcedureColumns(a: String, b: String, c: String, d: String): F[ResultSet]
  def getProcedureTerm: F[String]
  def getProcedures(a: String, b: String, c: String): F[ResultSet]
  def getPseudoColumns(a: String, b: String, c: String, d: String): F[ResultSet]
  def getResultSetHoldability: F[Int]
  def getRowIdLifetime: F[RowIdLifetime]
  def getSQLKeywords: F[String]
  def getSQLStateType: F[Int]
  def getSchemaTerm: F[String]
  def getSchemas: F[ResultSet]
  def getSchemas(a: String, b: String): F[ResultSet]
  def getSearchStringEscape: F[String]
  def getStringFunctions: F[String]
  def getSuperTables(a: String, b: String, c: String): F[ResultSet]
  def getSuperTypes(a: String, b: String, c: String): F[ResultSet]
  def getSystemFunctions: F[String]
  def getTablePrivileges(a: String, b: String, c: String): F[ResultSet]
  def getTableTypes: F[ResultSet]
  def getTables(a: String, b: String, c: String, d: Array[String]): F[ResultSet]
  def getTimeDateFunctions: F[String]
  def getTypeInfo: F[ResultSet]
  def getUDTs(a: String, b: String, c: String, d: Array[Int]): F[ResultSet]
  def getURL: F[String]
  def getUserName: F[String]
  def getVersionColumns(a: String, b: String, c: String): F[ResultSet]
  def insertsAreDetected(a: Int): F[Boolean]
  def isCatalogAtStart: F[Boolean]
  def isReadOnly: F[Boolean]
  def isWrapperFor(a: Class[_]): F[Boolean]
  def locatorsUpdateCopy: F[Boolean]
  def nullPlusNonNullIsNull: F[Boolean]
  def nullsAreSortedAtEnd: F[Boolean]
  def nullsAreSortedAtStart: F[Boolean]
  def nullsAreSortedHigh: F[Boolean]
  def nullsAreSortedLow: F[Boolean]
  def othersDeletesAreVisible(a: Int): F[Boolean]
  def othersInsertsAreVisible(a: Int): F[Boolean]
  def othersUpdatesAreVisible(a: Int): F[Boolean]
  def ownDeletesAreVisible(a: Int): F[Boolean]
  def ownInsertsAreVisible(a: Int): F[Boolean]
  def ownUpdatesAreVisible(a: Int): F[Boolean]
  def storesLowerCaseIdentifiers: F[Boolean]
  def storesLowerCaseQuotedIdentifiers: F[Boolean]
  def storesMixedCaseIdentifiers: F[Boolean]
  def storesMixedCaseQuotedIdentifiers: F[Boolean]
  def storesUpperCaseIdentifiers: F[Boolean]
  def storesUpperCaseQuotedIdentifiers: F[Boolean]
  def supportsANSI92EntryLevelSQL: F[Boolean]
  def supportsANSI92FullSQL: F[Boolean]
  def supportsANSI92IntermediateSQL: F[Boolean]
  def supportsAlterTableWithAddColumn: F[Boolean]
  def supportsAlterTableWithDropColumn: F[Boolean]
  def supportsBatchUpdates: F[Boolean]
  def supportsCatalogsInDataManipulation: F[Boolean]
  def supportsCatalogsInIndexDefinitions: F[Boolean]
  def supportsCatalogsInPrivilegeDefinitions: F[Boolean]
  def supportsCatalogsInProcedureCalls: F[Boolean]
  def supportsCatalogsInTableDefinitions: F[Boolean]
  def supportsColumnAliasing: F[Boolean]
  def supportsConvert: F[Boolean]
  def supportsConvert(a: Int, b: Int): F[Boolean]
  def supportsCoreSQLGrammar: F[Boolean]
  def supportsCorrelatedSubqueries: F[Boolean]
  def supportsDataDefinitionAndDataManipulationTransactions: F[Boolean]
  def supportsDataManipulationTransactionsOnly: F[Boolean]
  def supportsDifferentTableCorrelationNames: F[Boolean]
  def supportsExpressionsInOrderBy: F[Boolean]
  def supportsExtendedSQLGrammar: F[Boolean]
  def supportsFullOuterJoins: F[Boolean]
  def supportsGetGeneratedKeys: F[Boolean]
  def supportsGroupBy: F[Boolean]
  def supportsGroupByBeyondSelect: F[Boolean]
  def supportsGroupByUnrelated: F[Boolean]
  def supportsIntegrityEnhancementFacility: F[Boolean]
  def supportsLikeEscapeClause: F[Boolean]
  def supportsLimitedOuterJoins: F[Boolean]
  def supportsMinimumSQLGrammar: F[Boolean]
  def supportsMixedCaseIdentifiers: F[Boolean]
  def supportsMixedCaseQuotedIdentifiers: F[Boolean]
  def supportsMultipleOpenResults: F[Boolean]
  def supportsMultipleResultSets: F[Boolean]
  def supportsMultipleTransactions: F[Boolean]
  def supportsNamedParameters: F[Boolean]
  def supportsNonNullableColumns: F[Boolean]
  def supportsOpenCursorsAcrossCommit: F[Boolean]
  def supportsOpenCursorsAcrossRollback: F[Boolean]
  def supportsOpenStatementsAcrossCommit: F[Boolean]
  def supportsOpenStatementsAcrossRollback: F[Boolean]
  def supportsOrderByUnrelated: F[Boolean]
  def supportsOuterJoins: F[Boolean]
  def supportsPositionedDelete: F[Boolean]
  def supportsPositionedUpdate: F[Boolean]
  def supportsRefCursors: F[Boolean]
  def supportsResultSetConcurrency(a: Int, b: Int): F[Boolean]
  def supportsResultSetHoldability(a: Int): F[Boolean]
  def supportsResultSetType(a: Int): F[Boolean]
  def supportsSavepoints: F[Boolean]
  def supportsSchemasInDataManipulation: F[Boolean]
  def supportsSchemasInIndexDefinitions: F[Boolean]
  def supportsSchemasInPrivilegeDefinitions: F[Boolean]
  def supportsSchemasInProcedureCalls: F[Boolean]
  def supportsSchemasInTableDefinitions: F[Boolean]
  def supportsSelectForUpdate: F[Boolean]
  def supportsStatementPooling: F[Boolean]
  def supportsStoredFunctionsUsingCallSyntax: F[Boolean]
  def supportsStoredProcedures: F[Boolean]
  def supportsSubqueriesInComparisons: F[Boolean]
  def supportsSubqueriesInExists: F[Boolean]
  def supportsSubqueriesInIns: F[Boolean]
  def supportsSubqueriesInQuantifieds: F[Boolean]
  def supportsTableCorrelationNames: F[Boolean]
  def supportsTransactionIsolationLevel(a: Int): F[Boolean]
  def supportsTransactions: F[Boolean]
  def supportsUnion: F[Boolean]
  def supportsUnionAll: F[Boolean]
  def unwrap[T](a: Class[T]): F[T]
  def updatesAreDetected(a: Int): F[Boolean]
  def usesLocalFilePerTable: F[Boolean]
  def usesLocalFiles: F[Boolean]
}
