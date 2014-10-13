////////////////////////////////////////////////////////////////
//
// Copyright (C) 2005 Affymetrix, Inc.
//
// This library is free software; you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License 
// (version 2.1) as published by the Free Software Foundation.
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
////////////////////////////////////////////////////////////////


#include "calvin_files/template/src/TemplateData.h"
//

using namespace affymetrix_calvin_template;

/*
 * Initialize the class.
 */
TemplateData::TemplateData()
{
}

/*
 * Clean up.
 */
TemplateData::~TemplateData()
{
	Clear();
}

/*
 * Clears the member variables.
 */
void TemplateData::Clear()
{
	userAttributes.clear();
	fileId="";
	dataTypeId="";
	creationDateTime=L"";
	createdBy=L"";
}

