/*******************************************************************************
 * Copyright (C) 2018 The Zeepin Authors
 * This file is part of The Zeepin library.
 *
 * The Zeepin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Zeepin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with The Zeepin.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2018 The ontology Authors
 * This file is part of The ontology library.
 *
 * The ontology is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The ontology is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with The ontology.  If not, see <e <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package demo.ledger.common;

import com.github.zeepin.block.Block;
import com.github.zeepin.common.Helper;
import com.github.zeepin.io.BinaryReader;

import java.io.IOException;

/**
 *
 *
 */
public class BlockHeader extends Block {

    @Override
    public void deserialize(BinaryReader reader) throws IOException {
        deserializeUnsigned(reader);
        int len = (int) reader.readVarInt();
        sigData = new String[len];
        for (int i = 0; i < len; i++) {
            this.sigData[i] = Helper.toHexString(reader.readVarBytes());
        }

//        len = reader.readInt();
//        transactions = new Transaction[len];
//        for (int i = 0; i < transactions.length; i++) {
//            transactions[i] = Transaction.deserializeFrom(reader);
//        }
    }
}
