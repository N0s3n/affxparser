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
#include "DataSetWriter.h"

using namespace affymetrix_calvin_io;

DataSetWriter::DataSetWriter(std::ofstream* s, DataSetHeader* d) 
{
	os = s; 
	dataSetHdr = d;
	columnCnt = dataSetHdr->GetColumnCnt();
	columnIdx = 0;
	rowIdx = 0;
	rowCnt = dataSetHdr->GetRowCnt();
}

void DataSetWriter::WriteHeader()
{
	hdrWriter.Write(*os, *dataSetHdr);
	u_int32_t currentPos = os->tellp();
	dataSetHdr->SetDataStartFilePos(currentPos);
	hdrWriter.UpdateDataOffset(*os, currentPos);
}

void DataSetWriter::UpdateNextDataSetOffset() const
{
	u_int32_t currentPos = os->tellp();
	dataSetHdr->SetNextSetFilePos(currentPos);
	hdrWriter.UpdateNextDataSetOffset(*os, currentPos);
}

std::wstring DataSetWriter::GetDataSetName() const
{
	return dataSetHdr->GetName();
}

int32_t DataSetWriter::GetDataSetSize() const
{
	return dataSetHdr->GetDataSize();
}

void DataSetWriter::Write(int8_t p)
{
	FileOutput::WriteInt8(*os, p);
}

void DataSetWriter::Write(u_int8_t p)
{
	FileOutput::WriteUInt8(*os, p);
}

void DataSetWriter::Write(int16_t p)
{
	FileOutput::WriteInt16(*os, p);
}

void DataSetWriter::Write(u_int16_t p)
{
	FileOutput::WriteUInt16(*os, p);
}

void DataSetWriter::Write(int32_t p)
{
	FileOutput::WriteInt32(*os, p);
}

void DataSetWriter::Write(u_int32_t p)
{
	FileOutput::WriteUInt32(*os, p);
}

void DataSetWriter::Write(float p)
{
	FileOutput::WriteFloat(*os, p);
}

void DataSetWriter::Write(const std::string &p, int32_t maxLn)
{
	FileOutput::WriteString8(*os, p, maxLn);
}

void DataSetWriter::Write(const std::wstring &p, int32_t maxLn)
{
	FileOutput::WriteString16(*os, p, maxLn);
}