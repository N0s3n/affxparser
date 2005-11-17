/////////////////////////////////////////////////////////////////
//
// Copyright (C) 2005 Affymetrix, Inc.
//
// This library is free software; you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published
// by the Free Software Foundation; either version 2.1 of the License,
// or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful, but
// WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
// or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
// for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with this library; if not, write to the Free Software Foundation, Inc.,
// 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA 
//
/////////////////////////////////////////////////////////////////

#ifndef _GenericDataHeader_HEADER_
#define _GenericDataHeader_HEADER_

#include "AffymetrixBaseTypes.h"
#include "AffymetrixParameterConsts.h"
#include "ParameterNameValueType.h"
#include "AffymetrixGuid.h"
#include <string>
#include <vector>

#ifdef WIN32
#pragma warning(disable: 4290) // don't show warnings about throw keyword on function declarations.
#endif

using namespace affymetrix_calvin_parameter;

namespace affymetrix_calvin_io
{

class GenericDataHeader
{
public:
	
	GenericDataHeader();
	~GenericDataHeader() { Clear(); }

private:
	
	/*!  */
	std::string fileTypeId;
	/*!  */
	affymetrix_calvin_utilities::AffymetrixGuidType fileId;
	/*!  */
	std::wstring fileCreationTime;
	/*!  */
	std::wstring locale;
	/*!  */
	ParameterNameValueTypeVector nameValParams;
	/*!  */
	std::vector<GenericDataHeader> GenericDataHdrs;

public:

	/*!  */
	void Clear();
	/*!  */
	void SetFileTypeId(const std::string &p);
	/*!  */
	std::string GetFileTypeId() const;
	/*!  */
	void SetFileId(const affymetrix_calvin_utilities::AffymetrixGuidType &p);
	/*!  */
	affymetrix_calvin_utilities::AffymetrixGuidType GetFileId() const;
	/*!  */
	void SetFileCreationTime(const std::wstring &f);
	/*!  */
	std::wstring GetFileCreationTime() const;
	/*!  */
	void SetLocale(const std::wstring &p);
	/*!  */
	std::wstring GetLocale() const;
	/*!  */
	void AddNameValParam(const ParameterNameValueType &p);
	/*!  */
	ParameterNameValueType GetNameValParam(int32_t index);
	/*!  */
	int32_t GetNameValParamCnt() const;
	/*!  */
	void GetNameValIterators(ParameterNameValueTypeIt &begin, ParameterNameValueTypeIt &end);
	/*!  */
	int32_t GetParentCnt() const;
	/*!  */
	void AddParent(const GenericDataHeader &hdr);
	/*!  */
	GenericDataHeader GetParent(int32_t index) const;
	/*!  */
	void GetParentIterators(std::vector<GenericDataHeader>::iterator &begin, std::vector<GenericDataHeader>::iterator &end);
	/*! Find an immediate parent GenericDataHeader based on file type id.  Does not search grand-parents or above.
	 *	@param fileTypeId The fileTypeId of the parent header to find.
	 *	@return Returns a pointer to the parent GenericDataHeader if found, otherwise returns 0.
	 */
	GenericDataHeader* FindParent(const std::string& fileTypeId);
	/*! Finds a ParameterNameValueType by name in the nameValPairs collection
	 *	@param name The name of the NameValPair to find
	 *	@param result Reference to a ParameterNameValueType to fill with the found ParameterNameValueType.
	 *	@return true if the ParameterNameValueType was found
	 */
	bool FindNameValParam(const std::wstring& name, ParameterNameValueType& result);
	/*! Gets all ParameterNameValueType where the name starts with a given string.
	 *	@param beginsWith The string that the beginning of the ParameterNameValueType name needs to match.
	 *	@param p A result vector of ParameterNameValueTypes where the name begins with the beginsWith argument.
	 */
	bool GetNameValParamsBeginsWith(const std::wstring& beginsWith, ParameterNameValueTypeVector& p);

protected:
	/*! Finds a ParameterNameValueType by name in the nameValPairs collection
	 *	@param p The ParameterNameValueType to find
	 *	@return An iterator referencing the NameValPair if it exists, otherwise it returns nameValPairs.end()
	 */
	ParameterNameValueTypeIt FindNameValParam(const ParameterNameValueType& p);
};

/*! vector of GenericDataHeaders */
typedef std::vector<GenericDataHeader> GenDataHdrVector;

/*! iterator of GenericDataHeaders */
typedef std::vector<GenericDataHeader>::iterator GenDataHdrVectorIt;

};

#endif // _GenericDataHeader_HEADER_
