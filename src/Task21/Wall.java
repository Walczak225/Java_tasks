package Task21;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;

    @Override
    public Optional<Block> findBlockByColor(String color) {
        List<Block> blocks = getAllBlocks(this.blocks);
        for (Block block : blocks) {
            if (block.getColor().equals(color)) {
                return Optional.of(block);
            }
        }
        return Optional.empty();
    }

    public List<Block> findBlocksByMaterial(String material) {
        List<Block> blocks = getAllBlocks(this.blocks);
        List<Block> blocksByMaterial = new ArrayList<>();
        for (Block block : blocks) {
            if (block.getMaterial().equals(material)) {
                blocksByMaterial.add(block);
            }
        }

        return blocksByMaterial;
    }

    @Override
    public int count() {
       List<Block> blocks = getAllBlocks(this.blocks);
        // Implementacja metody
        return blocks.size();
    }

    private List<Block> getAllBlocks(List<Block> blocks) {
        List<Block> res = new ArrayList<>();
        getAllBlocksHelper(blocks, res);
        return res;
    }

    private void getAllBlocksHelper(List<Block> blocks, List<Block> res) {
        for (Block block : blocks) {
            if (block instanceof CompositeBlock) {
                getAllBlocksHelper(((CompositeBlock) block).getBlocks(), res);
            }
            res.add(block);
        }
    }
}

