package com.adamglin;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.adamglin.phosphoricons.__BoldKt;
import com.adamglin.phosphoricons.__DuotoneKt;
import com.adamglin.phosphoricons.__FillKt;
import com.adamglin.phosphoricons.__LightKt;
import com.adamglin.phosphoricons.__RegularKt;
import com.adamglin.phosphoricons.__ThinKt;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: __PhosphorIcons.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"__AllIcons", "", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AllIcons", "Lcom/adamglin/PhosphorIcons;", "getAllIcons", "(Lcom/adamglin/PhosphorIcons;)Ljava/util/List;", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class __PhosphorIconsKt {
    private static List<ImageVector> __AllIcons;

    public static final List<ImageVector> getAllIcons(PhosphorIcons phosphorIcons) {
        Intrinsics.checkNotNullParameter(phosphorIcons, "<this>");
        List<ImageVector> list = __AllIcons;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            return list;
        }
        List<ImageVector> plus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) __FillKt.getAllIcons(__FillKt.getFill(phosphorIcons)), (Iterable) __DuotoneKt.getAllIcons(__DuotoneKt.getDuotone(phosphorIcons))), (Iterable) __ThinKt.getAllIcons(__ThinKt.getThin(phosphorIcons))), (Iterable) __BoldKt.getAllIcons(__BoldKt.getBold(phosphorIcons))), (Iterable) __LightKt.getAllIcons(__LightKt.getLight(phosphorIcons))), (Iterable) __RegularKt.getAllIcons(__RegularKt.getRegular(phosphorIcons))), (Iterable) CollectionsKt.emptyList());
        __AllIcons = plus;
        Intrinsics.checkNotNull(plus);
        return plus;
    }
}
