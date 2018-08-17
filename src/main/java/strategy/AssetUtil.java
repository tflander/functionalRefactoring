package strategy;

import java.util.List;

public interface AssetUtil {

    static int totalAssetValues(final List<Asset> assets) {
        return assets.stream()
                .mapToInt(Asset::getValue)
                .sum();
    }

}
