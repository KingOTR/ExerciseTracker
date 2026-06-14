package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Exclude.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Exclude", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getExclude", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_exclude", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExcludeKt {
    private static ImageVector _exclude;

    public static final ImageVector getExclude(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _exclude;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Exclude", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(88.0f, 160.0f);
        pathBuilder.arcToRelative(73.37f, 73.37f, 0.0f, false, false, 0.4f, 7.6f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, true, true, 79.2f, -79.2f);
        pathBuilder.arcTo(73.37f, 73.37f, 0.0f, false, false, 160.0f, 88.0f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, false, 88.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(167.6f, 88.4f);
        pathBuilder.arcTo(73.37f, 73.37f, 0.0f, false, true, 168.0f, 96.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, true, -72.0f, 72.0f);
        pathBuilder.arcToRelative(73.37f, 73.37f, 0.0f, false, true, -7.6f, -0.4f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, true, false, 79.2f, -79.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(174.63f, 81.37f);
        pathBuilder2.arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.26f, 93.26f);
        pathBuilder2.arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.26f, -93.26f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.0f, 96.0f);
        pathBuilder2.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 126.0f, -16.0f);
        pathBuilder2.arcTo(80.08f, 80.08f, 0.0f, false, false, 80.05f, 158.0f);
        pathBuilder2.arcTo(64.11f, 64.11f, 0.0f, false, true, 32.0f, 96.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 96.0f);
        pathBuilder2.arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, 64.0f);
        pathBuilder2.arcTo(64.07f, 64.07f, 0.0f, false, true, 160.0f, 96.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 224.0f);
        pathBuilder2.arcTo(64.11f, 64.11f, 0.0f, false, true, 98.0f, 176.0f);
        pathBuilder2.arcTo(80.08f, 80.08f, 0.0f, false, false, 176.0f, 98.0f);
        pathBuilder2.arcTo(64.0f, 64.0f, 0.0f, false, true, 160.0f, 224.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _exclude = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
